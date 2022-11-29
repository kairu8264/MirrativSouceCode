package k7;

import com.bumptech.glide.integration.webp.WebpFrame;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f38454a;

    /* renamed from: b  reason: collision with root package name */
    public final int f38455b;

    /* renamed from: c  reason: collision with root package name */
    public final int f38456c;

    /* renamed from: d  reason: collision with root package name */
    public final int f38457d;

    /* renamed from: e  reason: collision with root package name */
    public final int f38458e;

    /* renamed from: f  reason: collision with root package name */
    public final int f38459f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f38460g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f38461h;

    public a(int i10, WebpFrame webpFrame) {
        this.f38454a = i10;
        this.f38455b = webpFrame.getXOffest();
        this.f38456c = webpFrame.getYOffest();
        this.f38457d = webpFrame.getWidth();
        this.f38458e = webpFrame.getHeight();
        this.f38459f = webpFrame.getDurationMs();
        this.f38460g = webpFrame.isBlendWithPreviousFrame();
        this.f38461h = webpFrame.shouldDisposeToBackgroundColor();
    }

    public String toString() {
        return "frameNumber=" + this.f38454a + ", xOffset=" + this.f38455b + ", yOffset=" + this.f38456c + ", width=" + this.f38457d + ", height=" + this.f38458e + ", duration=" + this.f38459f + ", blendPreviousFrame=" + this.f38460g + ", disposeBackgroundColor=" + this.f38461h;
    }
}
