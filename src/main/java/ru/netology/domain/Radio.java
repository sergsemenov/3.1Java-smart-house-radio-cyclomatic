package ru.netology.domain;

public class Radio {
    private final int maxChannel = 9;
    private final int minChannel = 0;
    private int currentChannel;

    public void nextChannel() {
        if (currentChannel == maxChannel) {
            currentChannel = minChannel;
            return;
        }
        currentChannel++;
    }

    public void previousChannel() {
        if (currentChannel == minChannel) {
            currentChannel = maxChannel;
            return;
        }
        currentChannel--;
    }
/* не используются
    public int getMaxChannel() {
        return maxChannel;
    }

    public int getMinChannel() {
        return minChannel;
    }
*/
    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        if (currentChannel > maxChannel) {
            this.currentChannel = maxChannel;
            return;
        }
        if (currentChannel < minChannel) {
            this.currentChannel = minChannel;
            return;
        }
        this.currentChannel = currentChannel;
    }
}
