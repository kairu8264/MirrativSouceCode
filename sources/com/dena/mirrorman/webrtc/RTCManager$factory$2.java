package com.dena.mirrorman.webrtc;

import android.content.Context;
import jo.q;
import org.webrtc.PeerConnectionFactory;

/* loaded from: classes3.dex */
public final class RTCManager$factory$2 extends q implements io.a<PeerConnectionFactory> {
    public final /* synthetic */ RTCManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RTCManager$factory$2(RTCManager rTCManager) {
        super(0);
        this.this$0 = rTCManager;
    }

    @Override // io.a
    public final PeerConnectionFactory invoke() {
        RTCAudioManager audioManager;
        Context context;
        audioManager = this.this$0.getAudioManager();
        audioManager.init();
        context = this.this$0.context;
        PeerConnectionFactory.initialize(PeerConnectionFactory.InitializationOptions.builder(context).setEnableInternalTracer(true).createInitializationOptions());
        return PeerConnectionFactory.builder().setOptions(new PeerConnectionFactory.Options()).createPeerConnectionFactory();
    }
}
