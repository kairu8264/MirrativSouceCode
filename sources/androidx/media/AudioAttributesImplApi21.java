package androidx.media;

import android.media.AudioAttributes;
import androidx.media.AudioAttributesImpl;

/* loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a  reason: collision with root package name */
    public AudioAttributes f15642a;

    /* renamed from: b  reason: collision with root package name */
    public int f15643b;

    /* loaded from: classes.dex */
    public static class a implements AudioAttributesImpl.a {

        /* renamed from: a  reason: collision with root package name */
        public final AudioAttributes.Builder f15644a = new AudioAttributes.Builder();

        @Override // androidx.media.AudioAttributesImpl.a
        public AudioAttributesImpl a() {
            return new AudioAttributesImplApi21(this.f15644a.build());
        }

        @Override // androidx.media.AudioAttributesImpl.a
        /* renamed from: c */
        public a b(int i10) {
            this.f15644a.setLegacyStreamType(i10);
            return this;
        }
    }

    public AudioAttributesImplApi21() {
        this.f15643b = -1;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int a() {
        int i10 = this.f15643b;
        return i10 != -1 ? i10 : AudioAttributesCompat.b(false, b(), c());
    }

    public int b() {
        return this.f15642a.getFlags();
    }

    public int c() {
        return this.f15642a.getUsage();
    }

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f15642a.equals(((AudioAttributesImplApi21) obj).f15642a);
        }
        return false;
    }

    public int hashCode() {
        return this.f15642a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f15642a;
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this(audioAttributes, -1);
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes, int i10) {
        this.f15643b = -1;
        this.f15642a = audioAttributes;
        this.f15643b = i10;
    }
}
