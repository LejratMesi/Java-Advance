    package com.sda.lesson.four;

    import java.util.Arrays;
    import java.util.List;
    import java.util.concurrent.*;
    import java.util.concurrent.atomic.AtomicInteger;

    public class AtamicExample {
        public static void main(String[] args) throws InterruptedException, ExecutionException {
            AtomicInteger atomicInteger = new AtomicInteger(1);
            List<Callable<Integer>> actions = Arrays.asList(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    return atomicInteger.addAndGet(1);
                }
            }, new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    return atomicInteger.decrementAndGet();
                }
            }, new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    return atomicInteger.addAndGet(20);
                }
            });
            ExecutorService atomic = Executors.newFixedThreadPool(5);
            List<Future<Integer>> results = atomic.invokeAll(actions);
            for (Future<Integer> result : results) {
                System.out.println(result.get());
            }
        }
    }
