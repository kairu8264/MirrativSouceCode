package ai;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.List;

/* loaded from: classes3.dex */
public final class uz extends RelativeLayout {

    /* renamed from: x  reason: collision with root package name */
    public static final float[] f10886x = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};

    /* renamed from: w  reason: collision with root package name */
    public AnimationDrawable f10887w;

    public uz(Context context, tz tzVar, RelativeLayout.LayoutParams layoutParams) {
        super(context);
        rh.p.i(tzVar);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(f10886x, null, null));
        shapeDrawable.getPaint().setColor(tzVar.c());
        setLayoutParams(layoutParams);
        wg.t.f();
        setBackground(shapeDrawable);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(tzVar.zzb())) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(tzVar.zzb());
            textView.setTextColor(tzVar.a());
            textView.setTextSize(tzVar.S5());
            dt.a();
            int q10 = nj0.q(context, 4);
            dt.a();
            textView.setPadding(q10, 0, nj0.q(context, 4), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        List<wz> d10 = tzVar.d();
        if (d10 != null && d10.size() > 1) {
            this.f10887w = new AnimationDrawable();
            for (wz wzVar : d10) {
                try {
                    this.f10887w.addFrame((Drawable) yh.b.z0(wzVar.zzb()), tzVar.T5());
                } catch (Exception e10) {
                    uj0.d("Error while getting drawable.", e10);
                }
            }
            wg.t.f();
            imageView.setBackground(this.f10887w);
        } else if (d10.size() == 1) {
            try {
                imageView.setImageDrawable((Drawable) yh.b.z0(d10.get(0).zzb()));
            } catch (Exception e11) {
                uj0.d("Error while getting drawable.", e11);
            }
        }
        addView(imageView);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable = this.f10887w;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }
}
