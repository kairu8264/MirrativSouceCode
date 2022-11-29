package gk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import com.google.android.play.core.review.ReviewException;
import com.google.android.play.core.review.ReviewInfo;
import dk.r;
import dk.v;
import jk.o;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes3.dex */
public final class k {

    /* renamed from: c  reason: collision with root package name */
    public static final dk.f f33649c = new dk.f("ReviewService");

    /* renamed from: a  reason: collision with root package name */
    public r<dk.c> f33650a;

    /* renamed from: b  reason: collision with root package name */
    public final String f33651b;

    public k(Context context) {
        this.f33651b = context.getPackageName();
        if (v.b(context)) {
            this.f33650a = new r<>(context, f33649c, "com.google.android.finsky.inappreviewservice.InAppReviewService", new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"), g.f33642a, null);
        }
    }

    public final jk.d<ReviewInfo> b() {
        dk.f fVar = f33649c;
        fVar.d("requestInAppReview (%s)", this.f33651b);
        if (this.f33650a == null) {
            fVar.b("Play Store app is either not installed or not the official version", new Object[0]);
            return jk.f.b(new ReviewException(-1));
        }
        o<?> oVar = new o<>();
        this.f33650a.q(new h(this, oVar, oVar), oVar);
        return oVar.a();
    }
}
