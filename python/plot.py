import matplotlib.pyplot as plt

x = [1, 2, 3, 4, 5]
y = [10, 7, 12, 5, 8]

plt.plot(x, y, marker='o')
plt.title('Simple Line Plot')
plt.xlabel('X Axis')
plt.ylabel('Y Axis')
plt.grid(True)
plt.show()
