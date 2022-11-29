package ai;

import com.google.android.gms.internal.ads.zzaaw;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public static Cipher f11831a;

    /* renamed from: b  reason: collision with root package name */
    public static final Object f11832b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static final Object f11833c = new Object();

    public x(SecureRandom secureRandom) {
    }

    public static final Cipher c() throws NoSuchAlgorithmException, NoSuchPaddingException {
        Cipher cipher;
        synchronized (f11833c) {
            if (f11831a == null) {
                f11831a = Cipher.getInstance("AES/CBC/PKCS5Padding");
            }
            cipher = f11831a;
        }
        return cipher;
    }

    public final String a(byte[] bArr, byte[] bArr2) throws zzaaw {
        byte[] doFinal;
        byte[] iv;
        int length = bArr.length;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f11832b) {
                c().init(1, secretKeySpec, (SecureRandom) null);
                doFinal = c().doFinal(bArr2);
                iv = c().getIV();
            }
            int length2 = doFinal.length + iv.length;
            ByteBuffer allocate = ByteBuffer.allocate(length2);
            allocate.put(iv).put(doFinal);
            allocate.flip();
            byte[] bArr3 = new byte[length2];
            allocate.get(bArr3);
            return i74.a(bArr3, false);
        } catch (InvalidKeyException e10) {
            throw new zzaaw(this, e10);
        } catch (NoSuchAlgorithmException e11) {
            throw new zzaaw(this, e11);
        } catch (BadPaddingException e12) {
            throw new zzaaw(this, e12);
        } catch (IllegalBlockSizeException e13) {
            throw new zzaaw(this, e13);
        } catch (NoSuchPaddingException e14) {
            throw new zzaaw(this, e14);
        }
    }

    public final byte[] b(byte[] bArr, String str) throws zzaaw {
        byte[] doFinal;
        int length = bArr.length;
        try {
            byte[] b10 = i74.b(str, false);
            int length2 = b10.length;
            if (length2 > 16) {
                ByteBuffer allocate = ByteBuffer.allocate(length2);
                allocate.put(b10);
                allocate.flip();
                byte[] bArr2 = new byte[16];
                byte[] bArr3 = new byte[length2 - 16];
                allocate.get(bArr2);
                allocate.get(bArr3);
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                synchronized (f11832b) {
                    c().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                    doFinal = c().doFinal(bArr3);
                }
                return doFinal;
            }
            throw new zzaaw(this);
        } catch (IllegalArgumentException e10) {
            throw new zzaaw(this, e10);
        } catch (InvalidAlgorithmParameterException e11) {
            throw new zzaaw(this, e11);
        } catch (InvalidKeyException e12) {
            throw new zzaaw(this, e12);
        } catch (NoSuchAlgorithmException e13) {
            throw new zzaaw(this, e13);
        } catch (BadPaddingException e14) {
            throw new zzaaw(this, e14);
        } catch (IllegalBlockSizeException e15) {
            throw new zzaaw(this, e15);
        } catch (NoSuchPaddingException e16) {
            throw new zzaaw(this, e16);
        }
    }
}
