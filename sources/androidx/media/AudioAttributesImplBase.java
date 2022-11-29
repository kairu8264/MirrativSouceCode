package androidx.media;

import android.util.Log;
import androidx.media.AudioAttributesImpl;
import java.util.Arrays;

/* loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a  reason: collision with root package name */
    public int f15645a;

    /* renamed from: b  reason: collision with root package name */
    public int f15646b;

    /* renamed from: c  reason: collision with root package name */
    public int f15647c;

    /* renamed from: d  reason: collision with root package name */
    public int f15648d;

    /* loaded from: classes.dex */
    public static class a implements AudioAttributesImpl.a {

        /* renamed from: a  reason: collision with root package name */
        public int f15649a = 0;

        /* renamed from: b  reason: collision with root package name */
        public int f15650b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f15651c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f15652d = -1;

        @Override // androidx.media.AudioAttributesImpl.a
        public AudioAttributesImpl a() {
            return new AudioAttributesImplBase(this.f15650b, this.f15651c, this.f15649a, this.f15652d);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public final a c(int i10) {
            switch (i10) {
                case 0:
                    this.f15650b = 1;
                    break;
                case 1:
                    this.f15650b = 4;
                    break;
                case 2:
                    this.f15650b = 4;
                    break;
                case 3:
                    this.f15650b = 2;
                    break;
                case 4:
                    this.f15650b = 4;
                    break;
                case 5:
                    this.f15650b = 4;
                    break;
                case 6:
                    this.f15650b = 1;
                    this.f15651c |= 4;
                    break;
                case 7:
                    this.f15651c = 1 | this.f15651c;
                    this.f15650b = 4;
                    break;
                case 8:
                    this.f15650b = 4;
                    break;
                case 9:
                    this.f15650b = 4;
                    break;
                case 10:
                    this.f15650b = 1;
                    break;
                default:
                    Log.e("AudioAttributesCompat", "Invalid stream type " + i10 + " for AudioAttributesCompat");
                    break;
            }
            this.f15649a = AudioAttributesImplBase.e(i10);
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.a
        /* renamed from: d */
        public a b(int i10) {
            if (i10 != 10) {
                this.f15652d = i10;
                return c(i10);
            }
            throw new IllegalArgumentException("STREAM_ACCESSIBILITY is not a legacy stream type that was used for audio playback");
        }
    }

    public AudioAttributesImplBase() {
        this.f15645a = 0;
        this.f15646b = 0;
        this.f15647c = 0;
        this.f15648d = -1;
    }

    public static int e(int i10) {
        switch (i10) {
            case 0:
                return 2;
            case 1:
            case 7:
                return 13;
            case 2:
                return 6;
            case 3:
                return 1;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 2;
            case 8:
                return 3;
            case 9:
            default:
                return 0;
            case 10:
                return 11;
        }
    }

    @Override // androidx.media.AudioAttributesImpl
    public int a() {
        int i10 = this.f15648d;
        return i10 != -1 ? i10 : AudioAttributesCompat.b(false, this.f15647c, this.f15645a);
    }

    public int b() {
        return this.f15646b;
    }

    public int c() {
        int i10 = this.f15647c;
        int a10 = a();
        if (a10 == 6) {
            i10 |= 4;
        } else if (a10 == 7) {
            i10 |= 1;
        }
        return i10 & 273;
    }

    public int d() {
        return this.f15645a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplBase) {
            AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
            return this.f15646b == audioAttributesImplBase.b() && this.f15647c == audioAttributesImplBase.c() && this.f15645a == audioAttributesImplBase.d() && this.f15648d == audioAttributesImplBase.f15648d;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f15646b), Integer.valueOf(this.f15647c), Integer.valueOf(this.f15645a), Integer.valueOf(this.f15648d)});
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AudioAttributesCompat:");
        if (this.f15648d != -1) {
            sb2.append(" stream=");
            sb2.append(this.f15648d);
            sb2.append(" derived");
        }
        sb2.append(" usage=");
        sb2.append(AudioAttributesCompat.c(this.f15645a));
        sb2.append(" content=");
        sb2.append(this.f15646b);
        sb2.append(" flags=0x");
        sb2.append(Integer.toHexString(this.f15647c).toUpperCase());
        return sb2.toString();
    }

    public AudioAttributesImplBase(int i10, int i11, int i12, int i13) {
        this.f15645a = 0;
        this.f15646b = 0;
        this.f15647c = 0;
        this.f15648d = -1;
        this.f15646b = i10;
        this.f15647c = i11;
        this.f15645a = i12;
        this.f15648d = i13;
    }
}
