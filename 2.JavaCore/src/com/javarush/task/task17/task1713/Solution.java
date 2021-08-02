package com.javarush.task.task17.task1713;

import java.util.*;
import java.util.function.UnaryOperator;

/* 
Общий список
*/

public class Solution implements List<Long> {
    private ArrayList<Long> original = new ArrayList<Long>();

    public static void main(String[] args) {

    }

    @Override
    public synchronized int size() {
        return 0;
    }

    @Override
    public synchronized boolean isEmpty() {
        return false;
    }

    @Override
    public synchronized boolean contains(Object o) {
        return false;
    }

    @Override
    public synchronized Iterator<Long> iterator() {
        return null;
    }

    @Override
    public synchronized Object[] toArray() {
        return new Object[0];
    }

    @Override
    public synchronized  <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public synchronized boolean add(Long aLong) {
        return false;
    }

    @Override
    public synchronized boolean remove(Object o) {
        return false;
    }

    @Override
    public synchronized boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public synchronized boolean addAll(Collection<? extends Long> c) {
        return false;
    }

    @Override
    public synchronized boolean addAll(int index, Collection<? extends Long> c) {
        return false;
    }

    @Override
    public synchronized boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public synchronized boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public synchronized void replaceAll(UnaryOperator<Long> operator) {
        List.super.replaceAll(operator);
    }

    @Override
    public synchronized void sort(Comparator<? super Long> c) {
        List.super.sort(c);
    }

    @Override
    public s void clear() {

    }

    @Override
    public Long get(int index) {
        return null;
    }

    @Override
    public Long set(int index, Long element) {
        return null;
    }

    @Override
    public void add(int index, Long element) {

    }

    @Override
    public Long remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Long> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Long> listIterator(int index) {
        return null;
    }

    @Override
    public List<Long> subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public Spliterator<Long> spliterator() {
        return List.super.spliterator();
    }
}
