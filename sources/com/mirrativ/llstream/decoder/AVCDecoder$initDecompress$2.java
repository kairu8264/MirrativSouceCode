package com.mirrativ.llstream.decoder;

import co.f;
import co.l;
import io.p;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import uo.q0;
import wn.m;
import wn.v;

@f(c = "com.mirrativ.llstream.decoder.AVCDecoder$initDecompress$2", f = "AVCDecoder.kt", l = {460}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class AVCDecoder$initDecompress$2 extends l implements p<q0, ao.d<? super v>, Object> {
    public int label;
    public final /* synthetic */ AVCDecoder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AVCDecoder$initDecompress$2(AVCDecoder aVCDecoder, ao.d<? super AVCDecoder$initDecompress$2> dVar) {
        super(2, dVar);
        this.this$0 = aVCDecoder;
    }

    @Override // co.a
    public final ao.d<v> create(Object obj, ao.d<?> dVar) {
        return new AVCDecoder$initDecompress$2(this.this$0, dVar);
    }

    @Override // io.p
    public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
        return ((AVCDecoder$initDecompress$2) create(q0Var, dVar)).invokeSuspend(v.f59242a);
    }

    @Override // co.a
    public final Object invokeSuspend(Object obj) {
        AtomicBoolean atomicBoolean;
        AtomicBoolean atomicBoolean2;
        AtomicBoolean atomicBoolean3;
        Object decode;
        Object c10 = bo.c.c();
        int i10 = this.label;
        try {
            if (i10 == 0) {
                m.b(obj);
                AVCDecoder aVCDecoder = this.this$0;
                this.label = 1;
                decode = aVCDecoder.decode(this);
                if (decode == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                m.b(obj);
            }
        } catch (IllegalArgumentException e10) {
            atomicBoolean3 = this.this$0.decoding;
            atomicBoolean3.set(false);
            AVCDecoderCallback callback = this.this$0.getCallback();
            if (callback != null) {
                callback.onError(e10);
            }
        } catch (CancellationException e11) {
            atomicBoolean2 = this.this$0.decoding;
            atomicBoolean2.set(false);
            AVCDecoderCallback callback2 = this.this$0.getCallback();
            if (callback2 != null) {
                callback2.onError(e11);
            }
        } catch (IllegalStateException e12) {
            atomicBoolean = this.this$0.decoding;
            atomicBoolean.set(false);
            AVCDecoderCallback callback3 = this.this$0.getCallback();
            if (callback3 != null) {
                callback3.onError(e12);
            }
        }
        return v.f59242a;
    }
}
