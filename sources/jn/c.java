package jn;

import android.app.Activity;
import android.content.Intent;
import com.twitter.sdk.android.core.identity.OAuthActivity;
import in.q;
import in.x;

/* loaded from: classes4.dex */
public class c extends a {
    public c(q qVar, in.c<x> cVar, int i10) {
        super(qVar, cVar, i10);
    }

    @Override // jn.a
    public boolean a(Activity activity) {
        activity.startActivityForResult(e(activity), this.f38108a);
        return true;
    }

    public Intent e(Activity activity) {
        Intent intent = new Intent(activity, OAuthActivity.class);
        intent.putExtra("auth_config", b());
        return intent;
    }
}
