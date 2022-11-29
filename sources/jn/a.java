package jn;

import android.app.Activity;
import android.content.Intent;
import com.dena.mirrorman.clientlog.logs.LogBase;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import com.twitter.sdk.android.core.TwitterAuthException;
import in.l;
import in.q;
import in.r;
import in.x;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f38108a;

    /* renamed from: b  reason: collision with root package name */
    public final q f38109b;

    /* renamed from: c  reason: collision with root package name */
    public final in.c<x> f38110c;

    public a(q qVar, in.c<x> cVar, int i10) {
        this.f38109b = qVar;
        this.f38110c = cVar;
        this.f38108a = i10;
    }

    public abstract boolean a(Activity activity);

    public q b() {
        return this.f38109b;
    }

    public in.c<x> c() {
        return this.f38110c;
    }

    public boolean d(int i10, int i11, Intent intent) {
        if (this.f38108a != i10) {
            return false;
        }
        in.c<x> c10 = c();
        if (c10 != null) {
            if (i11 == -1) {
                String stringExtra = intent.getStringExtra("tk");
                String stringExtra2 = intent.getStringExtra(TopicConstant.EXTEND_HLS_TS);
                String stringExtra3 = intent.getStringExtra("screen_name");
                c10.d(new l<>(new x(new r(stringExtra, stringExtra2), intent.getLongExtra(LogBase.USER_ID, 0L), stringExtra3), null));
                return true;
            } else if (intent != null && intent.hasExtra("auth_error")) {
                c10.c((TwitterAuthException) intent.getSerializableExtra("auth_error"));
                return true;
            } else {
                c10.c(new TwitterAuthException("Authorize failed."));
                return true;
            }
        }
        return true;
    }
}
