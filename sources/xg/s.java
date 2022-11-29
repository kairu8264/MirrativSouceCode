package xg;

import ai.dt;
import ai.nj0;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;

/* loaded from: classes3.dex */
public final class s extends FrameLayout implements View.OnClickListener {

    /* renamed from: w  reason: collision with root package name */
    public final ImageButton f60286w;

    /* renamed from: x  reason: collision with root package name */
    public final b0 f60287x;

    public s(Context context, r rVar, b0 b0Var) {
        super(context);
        this.f60287x = b0Var;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.f60286w = imageButton;
        imageButton.setImageResource(17301527);
        imageButton.setBackgroundColor(0);
        imageButton.setOnClickListener(this);
        dt.a();
        int q10 = nj0.q(context, rVar.f60282a);
        dt.a();
        int q11 = nj0.q(context, 0);
        dt.a();
        int q12 = nj0.q(context, rVar.f60283b);
        dt.a();
        imageButton.setPadding(q10, q11, q12, nj0.q(context, rVar.f60284c));
        imageButton.setContentDescription("Interstitial close button");
        dt.a();
        int q13 = nj0.q(context, rVar.f60285d + rVar.f60282a + rVar.f60283b);
        dt.a();
        addView(imageButton, new FrameLayout.LayoutParams(q13, nj0.q(context, rVar.f60285d + rVar.f60284c), 17));
    }

    public final void a(boolean z10) {
        if (z10) {
            this.f60286w.setVisibility(8);
        } else {
            this.f60286w.setVisibility(0);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        b0 b0Var = this.f60287x;
        if (b0Var != null) {
            b0Var.d();
        }
    }
}
