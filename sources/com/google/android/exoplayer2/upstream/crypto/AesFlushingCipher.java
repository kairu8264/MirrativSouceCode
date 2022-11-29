package com.google.android.exoplayer2.upstream.crypto;

import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public final class AesFlushingCipher {
    private final int blockSize;
    private final Cipher cipher;
    private final byte[] flushedBlock;
    private int pendingXorBytes;
    private final byte[] zerosBlock;

    public AesFlushingCipher(int i10, byte[] bArr, long j10, long j11) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
            this.cipher = cipher;
            int blockSize = cipher.getBlockSize();
            this.blockSize = blockSize;
            this.zerosBlock = new byte[blockSize];
            this.flushedBlock = new byte[blockSize];
            long j12 = j11 / blockSize;
            int i11 = (int) (j11 % blockSize);
            cipher.init(i10, new SecretKeySpec(bArr, Util.splitAtFirst(cipher.getAlgorithm(), "/")[0]), new IvParameterSpec(getInitializationVector(j10, j12)));
            if (i11 != 0) {
                updateInPlace(new byte[i11], 0, i11);
            }
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e10) {
            throw new RuntimeException(e10);
        }
    }

    private byte[] getInitializationVector(long j10, long j11) {
        return ByteBuffer.allocate(16).putLong(j10).putLong(j11).array();
    }

    private int nonFlushingUpdate(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        try {
            return this.cipher.update(bArr, i10, i11, bArr2, i12);
        } catch (ShortBufferException e10) {
            throw new RuntimeException(e10);
        }
    }

    public void update(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        int i13 = i10;
        do {
            int i14 = this.pendingXorBytes;
            if (i14 > 0) {
                bArr2[i12] = (byte) (bArr[i13] ^ this.flushedBlock[this.blockSize - i14]);
                i12++;
                i13++;
                this.pendingXorBytes = i14 - 1;
                i11--;
            } else {
                int nonFlushingUpdate = nonFlushingUpdate(bArr, i13, i11, bArr2, i12);
                if (i11 == nonFlushingUpdate) {
                    return;
                }
                int i15 = i11 - nonFlushingUpdate;
                int i16 = 0;
                Assertions.checkState(i15 < this.blockSize);
                int i17 = i12 + nonFlushingUpdate;
                int i18 = this.blockSize - i15;
                this.pendingXorBytes = i18;
                Assertions.checkState(nonFlushingUpdate(this.zerosBlock, 0, i18, this.flushedBlock, 0) == this.blockSize);
                while (i16 < i15) {
                    bArr2[i17] = this.flushedBlock[i16];
                    i16++;
                    i17++;
                }
                return;
            }
        } while (i11 != 0);
    }

    public void updateInPlace(byte[] bArr, int i10, int i11) {
        update(bArr, i10, i11, bArr, i10);
    }
}
