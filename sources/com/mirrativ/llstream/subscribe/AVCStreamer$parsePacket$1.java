package com.mirrativ.llstream.subscribe;

import ao.d;
import bo.c;
import co.f;
import co.l;
import com.mirrativ.llstream.decoder.AVCDecoder;
import com.mirrativ.llstream.protocol.v1.topic.Extend;
import io.p;
import java.nio.ByteBuffer;
import uo.q0;
import wn.m;
import wn.v;

@f(c = "com.mirrativ.llstream.subscribe.AVCStreamer$parsePacket$1", f = "AVCStreamer.kt", l = {142}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class AVCStreamer$parsePacket$1 extends l implements p<q0, d<? super v>, Object> {
    public final /* synthetic */ Extend $extend;
    public final /* synthetic */ byte[] $payload;
    public final /* synthetic */ long $timeStamp;
    public int label;
    public final /* synthetic */ AVCStreamer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AVCStreamer$parsePacket$1(AVCStreamer aVCStreamer, byte[] bArr, long j10, Extend extend, d<? super AVCStreamer$parsePacket$1> dVar) {
        super(2, dVar);
        this.this$0 = aVCStreamer;
        this.$payload = bArr;
        this.$timeStamp = j10;
        this.$extend = extend;
    }

    @Override // co.a
    public final d<v> create(Object obj, d<?> dVar) {
        return new AVCStreamer$parsePacket$1(this.this$0, this.$payload, this.$timeStamp, this.$extend, dVar);
    }

    @Override // io.p
    public final Object invoke(q0 q0Var, d<? super v> dVar) {
        return ((AVCStreamer$parsePacket$1) create(q0Var, dVar)).invokeSuspend(v.f59242a);
    }

    @Override // co.a
    public final Object invokeSuspend(Object obj) {
        AVCDecoder aVCDecoder;
        Object c10 = c.c();
        int i10 = this.label;
        if (i10 == 0) {
            m.b(obj);
            aVCDecoder = this.this$0.decoder;
            ByteBuffer wrap = ByteBuffer.wrap(this.$payload);
            jo.p.g(wrap, "wrap(payload)");
            long j10 = this.$timeStamp;
            Extend extend = this.$extend;
            this.label = 1;
            if (aVCDecoder.putData(wrap, j10, extend, this) == c10) {
                return c10;
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            m.b(obj);
        }
        return v.f59242a;
    }
}
