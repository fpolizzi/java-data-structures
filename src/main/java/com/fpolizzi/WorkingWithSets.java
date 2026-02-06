package com.fpolizzi;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Created by fpolizzi on 03.02.26
 */
public class WorkingWithSets {

    static void main() {

        // define a set with HashSet
        Set<Ball> balls = new HashSet<>();

        // add some balls
        balls.add(new Ball("bue"));
        balls.add(new Ball("yellow"));
        balls.add(new Ball("yellow"));
        balls.add(new Ball("red"));

        // output the size of the set
        System.out.println(balls.size());

        // output all balls in the set
        balls.forEach(System.out::println);
    }

    // define a class
    static class Ball {
        private final String color;

        public Ball(String color) {
            this.color = color;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            Ball ball = (Ball) o;
            return Objects.equals(color, ball.color);
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(color);
        }

        @Override
        public String toString() {
            return "Ball{" +
                    "color='" + color + '\'' +
                    '}';
        }
    }

    // define a record
    // record Ball(String color) {}
}
