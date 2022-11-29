package com.dena.mirrorman.unity;

import android.content.Context;
import android.graphics.Bitmap;
import ao.d;
import bo.c;
import co.f;
import co.l;
import io.p;
import uo.q0;
import wn.m;
import wn.v;

@f(c = "com.dena.mirrorman.unity.UnityScreenshot$saveAvatarImages$1", f = "UnityScreenshot.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class UnityScreenshot$saveAvatarImages$1 extends l implements p<q0, d<? super v>, Object> {
    public final /* synthetic */ Bitmap $backgroundImage;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ p<String, String, v> $onSavedListener;
    public int label;
    public final /* synthetic */ UnityScreenshot this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UnityScreenshot$saveAvatarImages$1(UnityScreenshot unityScreenshot, Bitmap bitmap, Context context, p<? super String, ? super String, v> pVar, d<? super UnityScreenshot$saveAvatarImages$1> dVar) {
        super(2, dVar);
        this.this$0 = unityScreenshot;
        this.$backgroundImage = bitmap;
        this.$context = context;
        this.$onSavedListener = pVar;
    }

    @Override // co.a
    public final d<v> create(Object obj, d<?> dVar) {
        return new UnityScreenshot$saveAvatarImages$1(this.this$0, this.$backgroundImage, this.$context, this.$onSavedListener, dVar);
    }

    @Override // io.p
    public final Object invoke(q0 q0Var, d<? super v> dVar) {
        return ((UnityScreenshot$saveAvatarImages$1) create(q0Var, dVar)).invokeSuspend(v.f59242a);
    }

    @Override // co.a
    public final Object invokeSuspend(Object obj) {
        Bitmap createClosetBodyBitmap;
        Bitmap createClosetFaceBitmap;
        c.c();
        if (this.label == 0) {
            m.b(obj);
            createClosetBodyBitmap = this.this$0.createClosetBodyBitmap();
            createClosetFaceBitmap = this.this$0.createClosetFaceBitmap(this.$backgroundImage);
            String str = this.$context.getCacheDir() + "/closet_avatar_body_image.png";
            String str2 = this.$context.getCacheDir() + "/closet_avatar_face_image.png";
            this.this$0.saveBitmap(str, createClosetBodyBitmap);
            this.this$0.saveBitmap(str2, createClosetFaceBitmap);
            this.$onSavedListener.invoke(str, str2);
            return v.f59242a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
