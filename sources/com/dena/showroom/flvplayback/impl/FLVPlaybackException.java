package com.dena.showroom.flvplayback.impl;

import com.dena.showroom.flvplayback.profile.PlaybackProfile;

/* loaded from: classes3.dex */
public class FLVPlaybackException extends Exception {

    /* renamed from: w  reason: collision with root package name */
    public final Event f26543w;

    /* renamed from: x  reason: collision with root package name */
    public final PlaybackProfile f26544x;

    /* loaded from: classes3.dex */
    public enum Event {
        FAILED_TO_SETUP_AUDIO,
        FAILED_TO_SETUP_VIDEO,
        END_OF_STREAM,
        OVERFLOW,
        TOO_LONG_NETWORK_DELAY,
        TOO_LONG_DECODER_DELAY,
        TOO_SLOW_DECODER
    }

    public FLVPlaybackException(Event event, PlaybackProfile playbackProfile, Throwable th2) {
        super(event.name(), th2);
        this.f26543w = event;
        this.f26544x = playbackProfile;
    }

    public Event getEvent() {
        return this.f26543w;
    }

    public PlaybackProfile getProfile() {
        return this.f26544x;
    }

    public FLVPlaybackException(Event event, PlaybackProfile playbackProfile) {
        this(event, playbackProfile, null);
    }

    public FLVPlaybackException(Event event, Throwable th2) {
        this(event, null, th2);
    }

    public FLVPlaybackException(Event event) {
        this(event, null, null);
    }
}
