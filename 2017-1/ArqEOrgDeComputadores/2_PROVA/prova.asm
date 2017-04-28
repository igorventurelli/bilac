inicio:
  setb P3.3
  setb P3.4
  mov R0, #00001010b

  call de_zero_a_nove

  mov P1, #1111110b
  call delay

  clr P3.3
  setb P3.4
  call delay

  setb P3.3
  clr P3.4
  call delay

  clr P3.3
  clr P3.4
  call delay

  mov P1, #11111110b
  call delay
  mov P1, #11111101b
  call delay
  mov P1, #11111011b
  call delay
  mov P1, #11110111b
  call delay

  setb P3.3
  clr P3.4
  call delay

  clr P3.3
  setb P3.4
  call delay

  setb P3.3
  setb P3.4
  call delay

  mov P1, #11101111b
  call delay
  mov P1, #11011111b
  call delay

  mov P1, #11111111b
  clr P3.3
  setb P3.4

  call de_zero_a_nove

  de_zero_a_nove:
    ;zero
    mov P1, #11000000b
    call delay
    ;um
    mov P1, #11111001b
    call delay
    ;dois
    mov P1, #10100100b
    call delay
    ;tres
    mov P1, #10110000b
    call delay
    ;quatro
    mov P1, #10011001b
    call delay
    ;cinco
    mov P1, #10010010b
    call delay
    ;seis
    mov P1, #10000010b
    call delay
    ;sete
    mov P1, #11111000b
    call delay
    ;oito
    mov P1, #10000000b
    call delay
    ;nove
    mov P1, #10011000b
    ret

  delay:
    djnz R0, $
    mov R0, #00001010b
    ret
