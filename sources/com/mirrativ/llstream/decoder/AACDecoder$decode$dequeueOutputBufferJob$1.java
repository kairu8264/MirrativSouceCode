package com.mirrativ.llstream.decoder;

import android.media.MediaCodec;
import co.f;
import co.l;
import io.p;
import uo.q0;
import wn.m;
import wn.v;

@f(c = "com.mirrativ.llstream.decoder.AACDecoder$decode$dequeueOutputBufferJob$1", f = "AACDecoder.kt", l = {391}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class AACDecoder$decode$dequeueOutputBufferJob$1 extends l implements p<q0, ao.d<? super v>, Object> {
    public final /* synthetic */ MediaCodec $mediaCodec;
    public int label;
    public final /* synthetic */ AACDecoder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AACDecoder$decode$dequeueOutputBufferJob$1(AACDecoder aACDecoder, MediaCodec mediaCodec, ao.d<? super AACDecoder$decode$dequeueOutputBufferJob$1> dVar) {
        super(2, dVar);
        this.this$0 = aACDecoder;
        this.$mediaCodec = mediaCodec;
    }

    @Override // co.a
    public final ao.d<v> create(Object obj, ao.d<?> dVar) {
        return new AACDecoder$decode$dequeueOutputBufferJob$1(this.this$0, this.$mediaCodec, dVar);
    }

    @Override // io.p
    public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
        return ((AACDecoder$decode$dequeueOutputBufferJob$1) create(q0Var, dVar)).invokeSuspend(v.f59242a);
    }

    @Override // co.a
    public final Object invokeSuspend(Object obj) {
        Object dequeueOutputBuffer;
        Object c10 = bo.c.c();
        int i10 = this.label;
        if (i10 == 0) {
            m.b(obj);
            AACDecoder aACDecoder = this.this$0;
            MediaCodec mediaCodec = this.$mediaCodec;
            this.label = 1;
            dequeueOutputBuffer = aACDecoder.dequeueOutputBuffer(mediaCodec, this);
            if (dequeueOutputBuffer == c10) {
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
