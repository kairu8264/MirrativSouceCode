package com.mirrativ.llstream.subscribe;

import ao.d;
import bo.c;
import co.f;
import co.l;
import com.mirrativ.llstream.decoder.AACDecoder;
import com.mirrativ.llstream.protocol.v1.topic.Extend;
import io.p;
import java.nio.ByteBuffer;
import uo.q0;
import wn.m;
import wn.v;

@f(c = "com.mirrativ.llstream.subscribe.AACStreamer$parsePacket$1", f = "AACStreamer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class AACStreamer$parsePacket$1 extends l implements p<q0, d<? super v>, Object> {
    public final /* synthetic */ Extend $extend;
    public final /* synthetic */ byte[] $payload;
    public final /* synthetic */ long $timeStamp;
    public int label;
    public final /* synthetic */ AACStreamer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AACStreamer$parsePacket$1(AACStreamer aACStreamer, byte[] bArr, long j10, Extend extend, d<? super AACStreamer$parsePacket$1> dVar) {
        super(2, dVar);
        this.this$0 = aACStreamer;
        this.$payload = bArr;
        this.$timeStamp = j10;
        this.$extend = extend;
    }

    @Override // co.a
    public final d<v> create(Object obj, d<?> dVar) {
        return new AACStreamer$parsePacket$1(this.this$0, this.$payload, this.$timeStamp, this.$extend, dVar);
    }

    @Override // io.p
    public final Object invoke(q0 q0Var, d<? super v> dVar) {
        return ((AACStreamer$parsePacket$1) create(q0Var, dVar)).invokeSuspend(v.f59242a);
    }

    @Override // co.a
    public final Object invokeSuspend(Object obj) {
        AACDecoder aACDecoder;
        c.c();
        if (this.label == 0) {
            m.b(obj);
            aACDecoder = this.this$0.decoder;
            ByteBuffer wrap = ByteBuffer.wrap(this.$payload);
            jo.p.g(wrap, "wrap(payload)");
            aACDecoder.putData(wrap, this.$timeStamp, this.$extend);
            return v.f59242a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
