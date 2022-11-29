package com.dena.mirrorman.unity;

import jo.h;

/* loaded from: classes3.dex */
public abstract class MRUnityPlayerEvent {
    public static final int $stable = 0;

    /* loaded from: classes3.dex */
    public static final class PauseUnity extends MRUnityPlayerEvent {
        public static final int $stable = 0;
        public static final PauseUnity INSTANCE = new PauseUnity();

        private PauseUnity() {
            super(null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class ResumeUnity extends MRUnityPlayerEvent {
        public static final int $stable = 0;
        public static final ResumeUnity INSTANCE = new ResumeUnity();

        private ResumeUnity() {
            super(null);
        }
    }

    private MRUnityPlayerEvent() {
    }

    public /* synthetic */ MRUnityPlayerEvent(h hVar) {
        this();
    }
}
