package u7;

import android.annotation.SuppressLint;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import java.io.IOException;
import m7.g;
import m7.h;
import m7.i;
import m7.j;
import o7.u;
import v7.l;
import v7.m;
import v7.r;

/* loaded from: classes.dex */
public abstract class a<T> implements j<ImageDecoder.Source, T> {

    /* renamed from: a  reason: collision with root package name */
    public final r f54593a = r.b();

    /* renamed from: u7.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0856a implements ImageDecoder.OnHeaderDecodedListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f54594a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f54595b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ boolean f54596c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ m7.b f54597d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ l f54598e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ i f54599f;

        /* renamed from: u7.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0857a implements ImageDecoder.OnPartialImageListener {
            public C0857a() {
            }

            @Override // android.graphics.ImageDecoder.OnPartialImageListener
            public boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
                return false;
            }
        }

        public C0856a(int i10, int i11, boolean z10, m7.b bVar, l lVar, i iVar) {
            this.f54594a = i10;
            this.f54595b = i11;
            this.f54596c = z10;
            this.f54597d = bVar;
            this.f54598e = lVar;
            this.f54599f = iVar;
        }

        @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
        @SuppressLint({"Override"})
        public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            boolean z10 = false;
            if (a.this.f54593a.e(this.f54594a, this.f54595b, this.f54596c, false)) {
                imageDecoder.setAllocator(3);
            } else {
                imageDecoder.setAllocator(1);
            }
            if (this.f54597d == m7.b.PREFER_RGB_565) {
                imageDecoder.setMemorySizePolicy(0);
            }
            imageDecoder.setOnPartialImageListener(new C0857a());
            Size size = imageInfo.getSize();
            int i10 = this.f54594a;
            if (i10 == Integer.MIN_VALUE) {
                i10 = size.getWidth();
            }
            int i11 = this.f54595b;
            if (i11 == Integer.MIN_VALUE) {
                i11 = size.getHeight();
            }
            float b10 = this.f54598e.b(size.getWidth(), size.getHeight(), i10, i11);
            int round = Math.round(size.getWidth() * b10);
            int round2 = Math.round(size.getHeight() * b10);
            if (Log.isLoggable("ImageDecoder", 2)) {
                Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + round + "x" + round2 + "] scaleFactor: " + b10);
            }
            imageDecoder.setTargetSize(round, round2);
            int i12 = Build.VERSION.SDK_INT;
            if (i12 < 28) {
                if (i12 >= 26) {
                    imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
                    return;
                }
                return;
            }
            if (this.f54599f == i.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) {
                z10 = true;
            }
            imageDecoder.setTargetColorSpace(ColorSpace.get(z10 ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
        }
    }

    public abstract u<T> c(ImageDecoder.Source source, int i10, int i11, ImageDecoder.OnHeaderDecodedListener onHeaderDecodedListener) throws IOException;

    @Override // m7.j
    /* renamed from: d */
    public final u<T> b(ImageDecoder.Source source, int i10, int i11, h hVar) throws IOException {
        m7.b bVar = (m7.b) hVar.c(m.f56867f);
        l lVar = (l) hVar.c(l.f56865h);
        g<Boolean> gVar = m.f56871j;
        return c(source, i10, i11, new C0856a(i10, i11, hVar.c(gVar) != null && ((Boolean) hVar.c(gVar)).booleanValue(), bVar, lVar, (i) hVar.c(m.f56868g)));
    }

    @Override // m7.j
    /* renamed from: e */
    public final boolean a(ImageDecoder.Source source, h hVar) {
        return true;
    }
}
