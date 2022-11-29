package com.dena.mirrorman.widget;

import ae.y7;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.f;
import com.dena.mirrorman.net.glide.GlideApp;
import e8.a;
import e8.h;
import java.util.List;
import jo.p;
import nd.b1;
import nd.d1;
import nd.y0;
import sn.c;
import v7.i;

/* loaded from: classes3.dex */
public final class RoundedMultipleImagesView extends FrameLayout {

    /* renamed from: w  reason: collision with root package name */
    public final y7 f26391w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundedMultipleImagesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.h(context, "context");
        p.h(attributeSet, "attrs");
        this.f26391w = (y7) f.e(LayoutInflater.from(context), b1.rounded_multiple_images_view, this, true);
    }

    public final boolean a() {
        Context context = getContext();
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (!(activity != null && activity.isFinishing())) {
            if (!(activity != null && activity.isDestroyed())) {
                return false;
            }
        }
        return true;
    }

    public final void b(List<String> list, int i10) {
        this.f26391w.B.setVisibility(0);
        RelativeLayout relativeLayout = this.f26391w.B;
        p.g(relativeLayout, "binding.fourImages");
        e(relativeLayout, Integer.valueOf(i10), Integer.valueOf(i10));
        if (a()) {
            return;
        }
        AppCompatImageView appCompatImageView = this.f26391w.E;
        p.g(appCompatImageView, "binding.fourImagesUpperLeft");
        g(appCompatImageView, list, i10, d1.ic_face_second_quadrant_40_default, 0);
        AppCompatImageView appCompatImageView2 = this.f26391w.F;
        p.g(appCompatImageView2, "binding.fourImagesUpperRight");
        g(appCompatImageView2, list, i10, d1.ic_face_first_quadrant_40_default, 1);
        AppCompatImageView appCompatImageView3 = this.f26391w.D;
        p.g(appCompatImageView3, "binding.fourImagesBottomRight");
        g(appCompatImageView3, list, i10, d1.ic_face_fourth_quadrant_40_default, 2);
        AppCompatImageView appCompatImageView4 = this.f26391w.C;
        p.g(appCompatImageView4, "binding.fourImagesBottomLeft");
        g(appCompatImageView4, list, i10, d1.ic_face_third_quadrant_40_default, 3);
    }

    public final void c(Bitmap bitmap, int i10) {
        p.h(bitmap, "bitmap");
        this.f26391w.G.setVisibility(0);
        this.f26391w.M.setVisibility(8);
        this.f26391w.H.setVisibility(8);
        this.f26391w.B.setVisibility(8);
        AppCompatImageView appCompatImageView = this.f26391w.G;
        p.g(appCompatImageView, "binding.oneImage");
        e(appCompatImageView, Integer.valueOf(i10), Integer.valueOf(i10));
        this.f26391w.G.setImageBitmap(bitmap);
        invalidate();
        requestLayout();
    }

    public final void d(List<String> list, int i10) {
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(i10);
        this.f26391w.G.setVisibility(8);
        this.f26391w.M.setVisibility(8);
        this.f26391w.H.setVisibility(8);
        this.f26391w.B.setVisibility(8);
        if (list == null) {
            f("", dimensionPixelOffset);
        } else {
            int size = list.size();
            if (size == 0) {
                f("", dimensionPixelOffset);
            } else if (size == 1) {
                f(list.get(0), dimensionPixelOffset);
            } else if (size == 2) {
                j(list, dimensionPixelOffset);
            } else if (size != 3) {
                b(list, dimensionPixelOffset);
            } else {
                i(list, dimensionPixelOffset);
            }
        }
        invalidate();
        requestLayout();
    }

    public final void e(View view, Integer num, Integer num2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (num != null) {
            layoutParams.width = num.intValue();
        }
        if (num2 != null) {
            layoutParams.height = num2.intValue();
        }
        view.setLayoutParams(layoutParams);
    }

    public final void f(String str, int i10) {
        this.f26391w.G.setVisibility(0);
        AppCompatImageView appCompatImageView = this.f26391w.G;
        p.g(appCompatImageView, "binding.oneImage");
        e(appCompatImageView, Integer.valueOf(i10), Integer.valueOf(i10));
        if (a()) {
            return;
        }
        GlideApp.with(getContext()).load(str).circleCrop().placeholder(y0.W1).into(this.f26391w.G);
    }

    public final void g(ImageView imageView, List<String> list, int i10, int i11, int i12) {
        c.b bVar;
        int i13 = i10 / 2;
        e(imageView, Integer.valueOf(i13), Integer.valueOf(i13));
        if (i12 == 0) {
            bVar = c.b.TOP_LEFT;
        } else if (i12 == 1) {
            bVar = c.b.TOP_RIGHT;
        } else if (i12 != 2) {
            bVar = i12 != 3 ? null : c.b.BOTTOM_LEFT;
        } else {
            bVar = c.b.BOTTOM_RIGHT;
        }
        if (bVar == null) {
            return;
        }
        h bitmapTransform = h.bitmapTransform(new m7.f(new i(), new c(i13, 0, bVar)));
        p.g(bitmapTransform, "bitmapTransform(\n       …)\n            )\n        )");
        if (a()) {
            return;
        }
        GlideApp.with(getContext()).load(list.get(i12)).placeholder(i11).apply((a<?>) bitmapTransform).into(imageView);
    }

    public final void h(ImageView imageView, List<String> list, int i10, int i11, int i12) {
        h bitmapTransform;
        int i13 = i10 / 2;
        e(imageView, Integer.valueOf(i13), Integer.valueOf(i10));
        if (i12 != 0) {
            bitmapTransform = i12 != 1 ? null : h.bitmapTransform(new m7.f(new i(), new c(i13, 0, c.b.TOP_RIGHT), new c(i13, 0, c.b.BOTTOM_RIGHT)));
        } else {
            bitmapTransform = h.bitmapTransform(new m7.f(new i(), new c(i13, 0, c.b.TOP_LEFT), new c(i13, 0, c.b.BOTTOM_LEFT)));
        }
        if (bitmapTransform == null) {
            return;
        }
        GlideApp.with(getContext()).load(list.get(i12)).placeholder(i11).apply((a<?>) bitmapTransform).into(imageView);
    }

    public final void i(List<String> list, int i10) {
        this.f26391w.H.setVisibility(0);
        RelativeLayout relativeLayout = this.f26391w.H;
        p.g(relativeLayout, "binding.threeImages");
        e(relativeLayout, Integer.valueOf(i10), Integer.valueOf(i10));
        View view = this.f26391w.J;
        p.g(view, "binding.threeImagesHorizontalBorder");
        e(view, Integer.valueOf(i10 / 2), null);
        if (a()) {
            return;
        }
        AppCompatImageView appCompatImageView = this.f26391w.K;
        p.g(appCompatImageView, "binding.threeImagesLeft");
        h(appCompatImageView, list, i10, d1.ic_face_left_half_40_default, 0);
        AppCompatImageView appCompatImageView2 = this.f26391w.L;
        p.g(appCompatImageView2, "binding.threeImagesUpperRight");
        g(appCompatImageView2, list, i10, d1.ic_face_first_quadrant_40_default, 1);
        AppCompatImageView appCompatImageView3 = this.f26391w.I;
        p.g(appCompatImageView3, "binding.threeImagesBottomRight");
        g(appCompatImageView3, list, i10, d1.ic_face_fourth_quadrant_40_default, 2);
    }

    public final void j(List<String> list, int i10) {
        this.f26391w.M.setVisibility(0);
        RelativeLayout relativeLayout = this.f26391w.M;
        p.g(relativeLayout, "binding.twoImages");
        e(relativeLayout, Integer.valueOf(i10), Integer.valueOf(i10));
        if (a()) {
            return;
        }
        AppCompatImageView appCompatImageView = this.f26391w.N;
        p.g(appCompatImageView, "binding.twoImagesLeft");
        h(appCompatImageView, list, i10, d1.ic_face_left_half_40_default, 0);
        AppCompatImageView appCompatImageView2 = this.f26391w.O;
        p.g(appCompatImageView2, "binding.twoImagesRight");
        h(appCompatImageView2, list, i10, d1.ic_face_right_half_40_default, 1);
    }
}
