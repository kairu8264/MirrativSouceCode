package com.mirrativ.llstream.decoder;

import android.media.MediaCodec;
import co.f;
import co.l;
import io.p;
import uo.q0;
import wn.m;
import wn.v;

@f(c = "com.mirrativ.llstream.decoder.AVCDecoder$decode$dequeueOutputBufferJob$1", f = "AVCDecoder.kt", l = {490}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class AVCDecoder$decode$dequeueOutputBufferJob$1 extends l implements p<q0, ao.d<? super v>, Object> {
    public final /* synthetic */ MediaCodec $codec;
    public int label;
    public final /* synthetic */ AVCDecoder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AVCDecoder$decode$dequeueOutputBufferJob$1(AVCDecoder aVCDecoder, MediaCodec mediaCodec, ao.d<? super AVCDecoder$decode$dequeueOutputBufferJob$1> dVar) {
        super(2, dVar);
        this.this$0 = aVCDecoder;
        this.$codec = mediaCodec;
    }

    @Override // co.a
    public final ao.d<v> create(Object obj, ao.d<?> dVar) {
        return new AVCDecoder$decode$dequeueOutputBufferJob$1(this.this$0, this.$codec, dVar);
    }

    @Override // io.p
    public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
        return ((AVCDecoder$decode$dequeueOutputBufferJob$1) create(q0Var, dVar)).invokeSuspend(v.f59242a);
    }

    @Override // co.a
    public final Object invokeSuspend(Object obj) {
        Object dequeueOutputBuffer;
        Object c10 = bo.c.c();
        int i10 = this.label;
        if (i10 == 0) {
            m.b(obj);
            AVCDecoder aVCDecoder = this.this$0;
            MediaCodec mediaCodec = this.$codec;
            this.label = 1;
            dequeueOutputBuffer = aVCDecoder.dequeueOutputBuffer(mediaCodec, this);
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
