package ru.job4j.queue;

import java.util.Deque;

public class ReconstructPhrase {

    private final Deque<Character> descendingElements;

    private final Deque<Character> evenElements;

    public ReconstructPhrase(Deque<Character> descendingElements, Deque<Character> evenElements) {
        this.descendingElements = descendingElements;
        this.evenElements = evenElements;
    }

    private String getEvenElements() {
        int length = evenElements.size();
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < length; i += 2) {
            temp.append(evenElements.poll());
            evenElements.poll();
        }
        return temp.toString();
    }

    private String getDescendingElements() {
        int length = descendingElements.size();
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < length; i++) {
            temp.append(descendingElements.pollLast());
        }
        return temp.toString();
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}