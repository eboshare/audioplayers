package xyz.luan.audioplayers;

import java.util.HashMap;

abstract class Player {

    protected static boolean objectEquals(Object o1, Object o2) {
        return o1 == null && o2 == null || o1 != null && o1.equals(o2);
    }

    abstract String getPlayerId();

    abstract void play();

    abstract void stop();

    abstract void release();

    abstract void pause();

    abstract void setUrl(String url, boolean isLocal, HashMap<String, Object> headers);

    abstract void setVolume(double volume);

    abstract void configAttributes(boolean respectSilence);

    abstract void setReleaseMode(ReleaseMode releaseMode);

    abstract int getDuration();

    abstract int getCurrentPosition();

    abstract boolean isActuallyPlaying();

    /**
     * Seek operations cannot be called until after the player is ready.
     */
    abstract void seek(int position);
}
