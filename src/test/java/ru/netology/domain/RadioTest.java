package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    /* закомментировал для изучения покрытия по Cxty
     @Test
        public void nextChannel() {
            Radio radio = new Radio();
            radio.setCurrentChannel(5);
            radio.nextChannel();
            assertEquals(6, radio.getCurrentChannel());
        }
    */
    @Test
    // принесли пульт с возможностью ввода многозначных и отрицательных номеров каналов
    public void nextChannelFromNNN() {
        Radio radio = new Radio();
        radio.setCurrentChannel(500);
        radio.nextChannel();
        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    // принесли пульт с возможностью ввода многозначных и отрицательных номеров каналов
    public void nextChannelFromMinusNNN() {
        Radio radio = new Radio();
        radio.setCurrentChannel(-500);
        radio.nextChannel();
        assertEquals(1, radio.getCurrentChannel());
    }

    @Test
    public void nextChannelFromMaxChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(9);
        radio.nextChannel();
        assertEquals(0, radio.getCurrentChannel());
    }

    /* закомментировал для изучения покрытия по Cxty
   @Test
    public void previousChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(5);
        radio.previousChannel();
        assertEquals(4, radio.getCurrentChannel());
    }
*/
    @Test
    // принесли пульт с возможностью ввода многозначных и отрицательных номеров каналов
    public void previousChannelFromNNN() {
        Radio radio = new Radio();
        radio.setCurrentChannel(500);
        radio.previousChannel();
        assertEquals(8, radio.getCurrentChannel());
    }

    @Test
    // принесли пульт с возможностью ввода многозначных и отрицательных номеров каналов
    public void previousChannelFromMinusNNN() {
        Radio radio = new Radio();
        radio.setCurrentChannel(-500);
        radio.previousChannel();;
        assertEquals(9, radio.getCurrentChannel());
    }

    @Test
    public void previousChannelFromMinChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(0);
        radio.previousChannel();
        assertEquals(9, radio.getCurrentChannel());
    }
}
