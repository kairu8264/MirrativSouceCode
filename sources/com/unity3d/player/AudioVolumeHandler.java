package com.unity3d.player;

import android.content.Context;
import com.unity3d.player.a;

/* loaded from: classes4.dex */
public class AudioVolumeHandler implements a.b {

    /* renamed from: a  reason: collision with root package name */
    private a f28330a;

    public AudioVolumeHandler(Context context) {
        a aVar = new a(context);
        this.f28330a = aVar;
        aVar.a(this);
    }

    public final void a() {
        this.f28330a.a();
        this.f28330a = null;
    }

    @Override // com.unity3d.player.a.b
    public final native void onAudioVolumeChanged(int i10);
}
