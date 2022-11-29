package hf;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import com.twitter.sdk.android.core.TwitterException;
import wn.l;

/* loaded from: classes2.dex */
public final class r0 implements q0 {

    /* renamed from: a  reason: collision with root package name */
    public final Activity f35600a;

    /* loaded from: classes2.dex */
    public static final class a extends in.c<in.x> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ao.d<in.x> f35601a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(ao.d<? super in.x> dVar) {
            this.f35601a = dVar;
        }

        @Override // in.c
        public void c(TwitterException twitterException) {
            jo.p.h(twitterException, i7.e.f36387u);
            ao.d<in.x> dVar = this.f35601a;
            l.a aVar = wn.l.f59224w;
            dVar.resumeWith(wn.l.a(wn.m.a(twitterException)));
        }

        @Override // in.c
        public void d(in.l<in.x> lVar) {
            jo.p.h(lVar, "result");
            ao.d<in.x> dVar = this.f35601a;
            l.a aVar = wn.l.f59224w;
            dVar.resumeWith(wn.l.a(lVar.f36917a));
        }
    }

    public r0(Activity activity) {
        jo.p.h(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        this.f35600a = activity;
    }

    @Override // hf.q0
    public Object a(ao.d<? super in.x> dVar) {
        ao.i iVar = new ao.i(bo.b.b(dVar));
        jn.f fVar = new jn.f();
        fVar.d();
        fVar.a(this.f35600a, new a(iVar));
        Object a10 = iVar.a();
        if (a10 == bo.c.c()) {
            co.h.c(dVar);
        }
        return a10;
    }
}
