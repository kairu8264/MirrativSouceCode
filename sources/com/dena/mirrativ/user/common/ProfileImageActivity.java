package com.dena.mirrativ.user.common;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.f;
import com.dena.mirrativ.user.common.ProfileImageActivity;
import e.b;
import jo.h;
import jo.p;
import pc.s;

/* loaded from: classes2.dex */
public final class ProfileImageActivity extends b {
    public static final a O = new a(null);

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final Intent a(Context context, String str) {
            p.h(context, "context");
            p.h(str, "profileImageUrl");
            Intent intent = new Intent(context, ProfileImageActivity.class);
            intent.putExtra("EXTRA_PROFILE_IMAGE_URL", str);
            return intent;
        }
    }

    public static final void y3(ProfileImageActivity profileImageActivity, View view) {
        p.h(profileImageActivity, "this$0");
        profileImageActivity.finish();
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, b3.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setStatusBarColor(c3.a.d(this, nc.b.f41791b));
        s sVar = (s) f.g(this, nc.f.activity_profile_image);
        AppCompatImageView appCompatImageView = sVar.C;
        p.g(appCompatImageView, "binding.profileImageView");
        td.a.i(appCompatImageView, getIntent().getStringExtra("EXTRA_PROFILE_IMAGE_URL"));
        sVar.B.setOnClickListener(new View.OnClickListener() { // from class: oc.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProfileImageActivity.y3(ProfileImageActivity.this, view);
            }
        });
    }
}
