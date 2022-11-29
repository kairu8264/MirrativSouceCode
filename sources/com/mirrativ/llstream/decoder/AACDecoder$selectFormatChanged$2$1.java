package com.mirrativ.llstream.decoder;

import android.media.AudioFormat;
import co.f;
import co.l;
import com.mirrativ.llstream.subscribe.PCMPlayer;
import io.p;
import wn.v;
import wo.m;

@f(c = "com.mirrativ.llstream.decoder.AACDecoder$selectFormatChanged$2$1", f = "AACDecoder.kt", l = {334}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class AACDecoder$selectFormatChanged$2$1 extends l implements p<m<? extends Integer>, ao.d<? super v>, Object> {
    public final /* synthetic */ int $channel;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AACDecoder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AACDecoder$selectFormatChanged$2$1(AACDecoder aACDecoder, int i10, ao.d<? super AACDecoder$selectFormatChanged$2$1> dVar) {
        super(2, dVar);
        this.this$0 = aACDecoder;
        this.$channel = i10;
    }

    @Override // co.a
    public final ao.d<v> create(Object obj, ao.d<?> dVar) {
        AACDecoder$selectFormatChanged$2$1 aACDecoder$selectFormatChanged$2$1 = new AACDecoder$selectFormatChanged$2$1(this.this$0, this.$channel, dVar);
        aACDecoder$selectFormatChanged$2$1.L$0 = obj;
        return aACDecoder$selectFormatChanged$2$1;
    }

    @Override // io.p
    public /* bridge */ /* synthetic */ Object invoke(m<? extends Integer> mVar, ao.d<? super v> dVar) {
        return m22invokeWpGqRn0(mVar.l(), dVar);
    }

    /* renamed from: invoke-WpGqRn0  reason: not valid java name */
    public final Object m22invokeWpGqRn0(Object obj, ao.d<? super v> dVar) {
        return ((AACDecoder$selectFormatChanged$2$1) create(m.b(obj), dVar)).invokeSuspend(v.f59242a);
    }

    @Override // co.a
    public final Object invokeSuspend(Object obj) {
        PCMPlayer pCMPlayer;
        Object play;
        AudioFormat format;
        Object c10 = bo.c.c();
        int i10 = this.label;
        if (i10 == 0) {
            wn.m.b(obj);
            Integer num = (Integer) m.f(((m) this.L$0).l());
            if (num != null) {
                pCMPlayer = this.this$0.player;
                if (!jo.p.c((pCMPlayer == null || (format = pCMPlayer.getFormat()) == null) ? null : co.b.d(format.getSampleRate()), num)) {
                    AudioFormat build = new AudioFormat.Builder().setChannelMask(this.$channel).setSampleRate(num.intValue()).setEncoding(2).build();
                    AACDecoder aACDecoder = this.this$0;
                    jo.p.g(build, "audioFormat");
                    this.label = 1;
                    play = aACDecoder.play(build, this);
                    if (play == c10) {
                        return c10;
                    }
                }
            } else {
                return v.f59242a;
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            wn.m.b(obj);
        }
        return v.f59242a;
    }
}
