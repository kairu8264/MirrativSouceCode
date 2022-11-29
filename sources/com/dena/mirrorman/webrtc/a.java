package com.dena.mirrorman.webrtc;

import android.media.AudioManager;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ a f26335a = new a();

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i10) {
        RTCAudioManager.m20init$lambda0(i10);
    }
}
