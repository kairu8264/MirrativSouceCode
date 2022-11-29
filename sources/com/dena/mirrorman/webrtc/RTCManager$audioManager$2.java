package com.dena.mirrorman.webrtc;

import android.content.Context;
import com.dena.mirrorman.webrtc.RTCAudioManager;
import jo.q;

/* loaded from: classes3.dex */
public final class RTCManager$audioManager$2 extends q implements io.a<RTCAudioManager> {
    public final /* synthetic */ RTCManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RTCManager$audioManager$2(RTCManager rTCManager) {
        super(0);
        this.this$0 = rTCManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-0  reason: not valid java name */
    public static final void m21invoke$lambda0() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.a
    public final RTCAudioManager invoke() {
        Context context;
        RTCAudioManager.Companion companion = RTCAudioManager.Companion;
        context = this.this$0.context;
        return companion.create(context, b.f26336w);
    }
}
