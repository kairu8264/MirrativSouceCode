package de;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.dena.mirrorman.net.glide.GlideApp;
import com.dena.mirrorman.net.glide.GlideRequest;
import java.util.Set;
import jo.p;
import wn.v;

/* loaded from: classes2.dex */
public final class f {

    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f29597a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 1;
            iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 2;
            iArr[ImageView.ScaleType.CENTER_CROP.ordinal()] = 3;
            f29597a = iArr;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ImageView f29598w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.l<Uri, v> f29599x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ Uri f29600y;

        /* JADX WARN: Multi-variable type inference failed */
        public b(ImageView imageView, io.l<? super Uri, v> lVar, Uri uri) {
            this.f29598w = imageView;
            this.f29599x = lVar;
            this.f29600y = uri;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.f29598w.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            if (this.f29598w.getWidth() != 0 && this.f29598w.getHeight() != 0) {
                io.l<Uri, v> lVar = this.f29599x;
                ImageView imageView = this.f29598w;
                Uri uri = this.f29600y;
                p.g(uri, "url");
                lVar.invoke(f.b(imageView, uri));
                return;
            }
            this.f29599x.invoke(this.f29600y);
        }
    }

    public static final Uri b(ImageView imageView, Uri uri) {
        String str;
        ImageView.ScaleType scaleType = imageView.getScaleType();
        int i10 = scaleType == null ? -1 : a.f29597a[scaleType.ordinal()];
        if (i10 == 1) {
            str = "";
        } else if (i10 == 2) {
            str = "cover";
        } else if (i10 != 3) {
            return uri;
        } else {
            str = "bounds";
        }
        Uri build = uri.buildUpon().appendQueryParameter("width", String.valueOf(imageView.getWidth())).appendQueryParameter("height", String.valueOf(imageView.getHeight())).appendQueryParameter("fit", str).build();
        p.g(build, "urlBuilder.build()");
        return build;
    }

    public static final void c(ImageView imageView, String str, boolean z10, io.l<? super Uri, v> lVar) {
        p.h(imageView, "<this>");
        p.h(lVar, "callback");
        if (str != null && !TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            if (!z10) {
                lVar.invoke(parse);
                return;
            }
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (!queryParameterNames.contains("width") && !queryParameterNames.contains("height")) {
                if (imageView.getWidth() == 0) {
                    imageView.getViewTreeObserver().addOnGlobalLayoutListener(new b(imageView, lVar, parse));
                    return;
                }
                p.g(parse, "url");
                lVar.invoke(b(imageView, parse));
                return;
            }
            lVar.invoke(parse);
            return;
        }
        lVar.invoke(null);
    }

    public static /* synthetic */ void d(ImageView imageView, String str, boolean z10, io.l lVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        c(imageView, str, z10, lVar);
    }

    public static final void e(ImageView imageView, String str, Integer num) {
        p.h(imageView, "<this>");
        GlideRequest<Drawable> load = GlideApp.with(imageView).load(str);
        if (num != null) {
            num.intValue();
            load.placeholder(num.intValue());
        }
        load.apply((e8.a<?>) new e8.h().circleCrop()).into(imageView);
    }
}
