import { Link, Stack } from "expo-router";
import { Pressable } from 'react-native';
import React from 'react';
import Colors from '@/constants/Colors';
import { FontAwesome } from '@expo/vector-icons';
export default function MenuStack() {
  return (
    <Stack>
      <Stack.Screen name="index" options={{ title: 'Orders' }} />
    </Stack>
  )
}