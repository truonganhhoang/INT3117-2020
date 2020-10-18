# Section 8.5-6

# Pick a household appliance such as a watch, calculator, microwave, VCR, clock-radio or programmable thermostat. Draw the FSM that represents your appliance’s behavior. Derive abstract tests to satisfy Predicate Coverage, Correlated Active Clause Coverage, and General Inactive Clause Coverage. (An abstract test is in terms of the model, not the implementation.)

- Biến trạng thái:
    + Thời gian trong ngày: {sáng, trưa, chiều, tối}
    + Các loại ngày: {ngày thường, cuối tuần}

- Biến không trạng thái:
    + Thời gian: 0h -> 24h
    + Giờ: 0-24
    + Phút: 1-60
    + Nhiệt độ: 0-100