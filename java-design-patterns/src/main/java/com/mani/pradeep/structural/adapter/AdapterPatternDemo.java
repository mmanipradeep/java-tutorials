package com.mani.pradeep.structural.adapter;

public class AdapterPatternDemo {

    /**
     * In software engineering, the adapter pattern is a software design pattern
     * (also known as wrapper, an alternative naming shared with the decorator pattern) that allows the
     * interface of an existing class to be used as another interface.
     * It is often used to make existing classes work with others without modifying their source code.
     *
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
