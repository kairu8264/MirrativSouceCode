package com.mirrativ.llstream.decoder;

import android.util.Log;
import io.l;
import jo.p;
import jo.q;

/* loaded from: classes4.dex */
public final class AVCDecoder$filterIDR$1 extends q implements l<AVCPacket, Boolean> {
    public final /* synthetic */ AVCDecoder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AVCDecoder$filterIDR$1(AVCDecoder aVCDecoder) {
        super(1);
        this.this$0 = aVCDecoder;
    }

    @Override // io.l
    public final Boolean invoke(AVCPacket aVCPacket) {
        p.h(aVCPacket, "packet");
        boolean z10 = this.this$0.getCoordinator().getVideoPacketLastIDRTimestamp().get() <= aVCPacket.getTimestamp();
        if (!z10 && Log.isLoggable("AVCDecoder", 3)) {
            Log.d("AVCDecoder", "drop not idr packet");
        }
        return Boolean.valueOf(z10);
    }
}
