package com.mirrativ.llstream.decoder;

import android.media.MediaFormat;
import co.f;
import co.l;
import io.p;
import java.util.concurrent.CancellationException;
import uo.q0;
import wn.m;
import wn.v;

@f(c = "com.mirrativ.llstream.decoder.AACDecoder$initDecompress$3", f = "AACDecoder.kt", l = {306}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class AACDecoder$initDecompress$3 extends l implements p<q0, ao.d<? super v>, Object> {
    public final /* synthetic */ MediaFormat $inputFormat;
    public int label;
    public final /* synthetic */ AACDecoder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AACDecoder$initDecompress$3(AACDecoder aACDecoder, MediaFormat mediaFormat, ao.d<? super AACDecoder$initDecompress$3> dVar) {
        super(2, dVar);
        this.this$0 = aACDecoder;
        this.$inputFormat = mediaFormat;
    }

    @Override // co.a
    public final ao.d<v> create(Object obj, ao.d<?> dVar) {
        return new AACDecoder$initDecompress$3(this.this$0, this.$inputFormat, dVar);
    }

    @Override // io.p
    public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
        return ((AACDecoder$initDecompress$3) create(q0Var, dVar)).invokeSuspend(v.f59242a);
    }

    @Override // co.a
    public final Object invokeSuspend(Object obj) {
        Object decode;
        Object c10 = bo.c.c();
        int i10 = this.label;
        try {
            if (i10 == 0) {
                m.b(obj);
                AACDecoder aACDecoder = this.this$0;
                MediaFormat mediaFormat = this.$inputFormat;
                this.label = 1;
                decode = aACDecoder.decode(mediaFormat, this);
                if (decode == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                m.b(obj);
            }
        } catch (IllegalArgumentException e10) {
            AACDecoderCallback callback = this.this$0.getCallback();
            if (callback != null) {
                callback.onError(e10);
            }
        } catch (CancellationException e11) {
            AACDecoderCallback callback2 = this.this$0.getCallback();
            if (callback2 != null) {
                callback2.onError(e11);
            }
        } catch (IllegalStateException e12) {
            AACDecoderCallback callback3 = this.this$0.getCallback();
            if (callback3 != null) {
                callback3.onError(e12);
            }
        }
        return v.f59242a;
    }
}
