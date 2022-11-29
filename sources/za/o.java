package za;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import androidx.appcompat.widget.AppCompatImageView;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.glide.GlideApp;
import com.mirrativ.llstream.decoder.PacketJitterConfig;
import jo.p;

/* loaded from: classes2.dex */
public final class o extends androidx.fragment.app.e {
    public static final a N0 = new a(null);

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final o a(String str, String str2, String str3) {
            p.h(str, "title");
            p.h(str2, MRLog.PAYLOAD_KEY_DESCRIPTION);
            p.h(str3, "imageUrl");
            o oVar = new o();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_TITLE", str);
            bundle.putString("EXTRA_DESCRIPTION", str2);
            bundle.putString("EXTRA_IMAGE_URL", str3);
            oVar.V2(bundle);
            return oVar;
        }
    }

    public o() {
        super(wa.f.dialog_fragment_campaign_mission_receive_prizes_result);
    }

    public static final void C3(o oVar, View view) {
        p.h(oVar, "this$0");
        oVar.n3();
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        Window window;
        p.h(view, "view");
        super.e2(view, bundle);
        Dialog p32 = p3();
        if (p32 != null && (window = p32.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
        db.k T = db.k.T(view);
        T.H.setText(M2().getString("EXTRA_TITLE"));
        T.B.setText(M2().getString("EXTRA_DESCRIPTION"));
        GlideApp.with(N2()).load(M2().getString("EXTRA_IMAGE_URL")).into(T.E);
        T.D.setOnClickListener(new View.OnClickListener() { // from class: za.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                o.C3(o.this, view2);
            }
        });
        AppCompatImageView appCompatImageView = T.F;
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(PacketJitterConfig.MAX_BUFFER_QUEUE_TIME_MS);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        rotateAnimation.setRepeatCount(-1);
        appCompatImageView.startAnimation(rotateAnimation);
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        return new Dialog(N2(), wa.k.f58559a);
    }
}
