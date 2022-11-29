package gk;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.play.core.review.ReviewInfo;
import jk.o;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes3.dex */
public final class f implements a {

    /* renamed from: a  reason: collision with root package name */
    public final k f33640a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f33641b = new Handler(Looper.getMainLooper());

    public f(k kVar) {
        this.f33640a = kVar;
    }

    @Override // gk.a
    public final jk.d<ReviewInfo> a() {
        return this.f33640a.b();
    }

    @Override // gk.a
    public final jk.d<Void> b(Activity activity, ReviewInfo reviewInfo) {
        if (reviewInfo.b()) {
            return jk.f.c(null);
        }
        Intent intent = new Intent(activity, PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", reviewInfo.a());
        intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
        o oVar = new o();
        intent.putExtra("result_receiver", new e(this, this.f33641b, oVar));
        activity.startActivity(intent);
        return oVar.a();
    }
}
