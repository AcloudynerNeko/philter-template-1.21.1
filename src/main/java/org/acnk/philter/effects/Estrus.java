package org.acnk.philter.effects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MovementType;
import net.minecraft.entity.effect.InstantStatusEffect;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.potion.Potion;
import net.minecraft.text.Text;
import net.minecraft.util.math.Vec3d;


import java.util.Random;


public class Estrus extends StatusEffect {
    private static final Random random = new Random();
    public Estrus() {
        super(StatusEffectCategory.BENEFICIAL, 0xe9b8b5);
    }
    public static final Potion POTION = new Potion();

    //使指令中的seconds数字不代表tick
    @Override
    public boolean isInstant() {
        return false;
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

    @Override//随机移动
    public boolean applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (entity instanceof PlayerEntity player) {
            int x = new Random().nextInt(10) - 5;
            int z = new Random().nextInt(10) - 5;
            entity.move(MovementType.SHULKER_BOX, new Vec3d(x * 0.01, 0.0, z * 0.01));

            if (new java.util.Random().nextInt(400) == 0) {

                // 生成0~3的随机数
                int i = new java.util.Random().nextInt(4);

                // 在聊天栏发送消息
                player.sendMessage(Text.translatable("message.estrus." + i));
            }
            return super.applyUpdateEffect(entity, amplifier);
        }
        return true;
    }
}