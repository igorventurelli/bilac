comeco:
  clr P3.3
  clr P3.4

  mov R0, P2

  ;identificacao do numero 0
  cjne R0, #11111110b, nao_eh_zero
  eh_zero:
    mov P1, #11000000b
    jmp comeco
  nao_eh_zero:

    ;identificacao do numero 1
    cjne R0, #11111101b, nao_eh_um
    eh_um:
      mov P1, #11111001b
      jmp comeco
    nao_eh_um:

      ;identificacao do numero 2
      cjne R0, #11111011b, nao_eh_dois
      eh_dois:
        mov P1, #10100100b
        jmp comeco
      nao_eh_dois:

        ;identificacao do numero 3
        cjne R0, #11110111b, nao_eh_tres
        eh_tres:
          mov P1, #10110000b
          jmp comeco
        nao_eh_tres:

          ;identificacao do numero 4
          cjne R0, #11101111b, nao_eh_quatro
          eh_quatro:
            mov P1, #10011001b
            jmp comeco
          nao_eh_quatro:

            ;identificacao do numero 5
            cjne R0, #11011111b, nao_eh_cinco
            eh_cinco:
              mov P1, #10010010b
              jmp comeco
            nao_eh_cinco:

              ;identificacao do numero 6
              cjne R0, #10111111b, nao_eh_seis
              eh_seis:
                mov P1, #10000010b
                jmp comeco
              nao_eh_seis:

                ;identificacao do numero 7
                cjne R0, #01111111b, nao_eh_sete
                eh_sete:
                  mov P1, #11111000b
                  jmp comeco
                nao_eh_sete:
                  mov P1, #11111111b
                  jmp comeco
