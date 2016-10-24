package ua.od.hillel.JMH;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Fork(3)
@Warmup(iterations = 3)
@Measurement(iterations = 3)
public class MyBenchmark {

    @State(Scope.Thread)
    public static class MyState {
        public List<Integer> arrayList;
        public List<Integer> linkedList;

        @Setup(Level.Trial)
        public void setUp() {
            arrayList = new ArrayList<>(Collections.nCopies(1000, 0));
            linkedList = new LinkedList<>(arrayList);
        }
    }

    @Benchmark @OutputTimeUnit(TimeUnit.MICROSECONDS)
    public void testArrayList(MyState state, Blackhole blackhole) {
        Integer element = state.arrayList.get(900);
        blackhole.consume(element);
    }

    @Benchmark @OutputTimeUnit(TimeUnit.MICROSECONDS)
    public void testLinkedList(MyState state, Blackhole blackhole) {
        Integer element = state.linkedList.get(900);
        blackhole.consume(element);
    }

}
