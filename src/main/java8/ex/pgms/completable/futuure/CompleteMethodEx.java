package main.java8.ex.pgms.completable.futuure;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class CompleteMethodEx {

  public static void main(String[] args) throws InterruptedException, ExecutionException {

    CompletableFuture<String> completableFuture = new CompletableFuture<>();

    Executors.newCachedThreadPool().submit(() -> {
      Thread.sleep(500);
      completableFuture.complete("Hello");
      return null;
    });

    System.out.println(completableFuture.get());
  }
}
