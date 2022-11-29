package com.google.android.exoplayer2.audio;

/* loaded from: classes3.dex */
public interface AudioListener {
    default void onAudioAttributesChanged(AudioAttributes audioAttributes) {
    }

    default void onAudioSessionIdChanged(int i10) {
    }

    default void onSkipSilenceEnabledChanged(boolean z10) {
    }

    default void onVolumeChanged(float f10) {
    }
}
