package com.twitter.sdk.android.core.identity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ProgressBar;
import com.twitter.sdk.android.core.TwitterAuthException;
import com.twitter.sdk.android.core.identity.a;
import com.twitter.sdk.android.core.internal.oauth.d;
import in.j;
import in.k;
import in.q;
import in.v;

/* loaded from: classes4.dex */
public class OAuthActivity extends Activity implements a.c {

    /* renamed from: w  reason: collision with root package name */
    public a f28266w;

    /* renamed from: x  reason: collision with root package name */
    public ProgressBar f28267x;

    /* renamed from: y  reason: collision with root package name */
    public WebView f28268y;

    @Override // com.twitter.sdk.android.core.identity.a.c
    public void a(int i10, Intent intent) {
        setResult(i10, intent);
        finish();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.f28266w.i(0, new TwitterAuthException("Authorization failed, request was canceled."));
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(k.tw__activity_oauth);
        this.f28267x = (ProgressBar) findViewById(j.tw__spinner);
        this.f28268y = (WebView) findViewById(j.tw__web_view);
        this.f28267x.setVisibility(bundle != null ? bundle.getBoolean("progress", false) : true ? 0 : 8);
        a aVar = new a(this.f28267x, this.f28268y, (q) getIntent().getParcelableExtra("auth_config"), new d(v.g(), new kn.j()), this);
        this.f28266w = aVar;
        aVar.o();
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        if (this.f28267x.getVisibility() == 0) {
            bundle.putBoolean("progress", true);
        }
        super.onSaveInstanceState(bundle);
    }
}
