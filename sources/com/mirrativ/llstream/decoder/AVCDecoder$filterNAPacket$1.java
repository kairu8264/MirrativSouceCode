package com.mirrativ.llstream.decoder;

import android.util.Log;
import com.mirrativ.llstream.protocol.v1.topic.Extend;
import io.l;
import jo.p;
import jo.q;

/* loaded from: classes4.dex */
public final class AVCDecoder$filterNAPacket$1 extends q implements l<AVCPacket, Boolean> {
    public final /* synthetic */ AVCDecoder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AVCDecoder$filterNAPacket$1(AVCDecoder aVCDecoder) {
        super(1);
        this.this$0 = aVCDecoder;
    }

    @Override // io.l
    public final Boolean invoke(AVCPacket aVCPacket) {
        p.h(aVCPacket, "packet");
        boolean isAcceptableVideoTimestamp = aVCPacket.getNalType() == Extend.AVC_IDR ? true : this.this$0.getCoordinator().isAcceptableVideoTimestamp(aVCPacket.getTimestamp());
        if (!isAcceptableVideoTimestamp && Log.isLoggable("AVCDecoder", 3)) {
            Log.d("AVCDecoder", "drop not acceptable packet");
        }
        return Boolean.valueOf(isAcceptableVideoTimestamp);
    }
}
