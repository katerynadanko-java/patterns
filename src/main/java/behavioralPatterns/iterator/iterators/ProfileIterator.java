package behavioralPatterns.iterator.iterators;


import behavioralPatterns.iterator.profiles.Profile;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}
