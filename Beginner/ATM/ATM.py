inps = input().split();

debit = int(inps[0])
total = float(inps[1])

if(debit % 5 == 0):
    final = total - debit - 0.5
    if(final >= 0):
        print("{:.2f}".format(final))
    else:
        print("{:.2f}".format(total))
else:
    print("{:.2f}".format(total))